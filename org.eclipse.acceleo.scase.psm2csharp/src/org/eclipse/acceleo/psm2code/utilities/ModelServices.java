package org.eclipse.acceleo.psm2code.utilities;
import java.text.DateFormat;
import java.util.*;
import org.eclipse.acceleo.psm2code.utilities.Graph;
import org.eclipse.acceleo.psm2code.utilities.Graph.*;
import org.eclipse.emf.common.util.EList;

import PSM.CSharpResourceModel;
import PSM.CSharpResourceModelManager;
import PSM.RESTfulServicePSM;

public class ModelServices {
	
	public Graph<CSharpResourceModel> createResourceGraph(RESTfulServicePSM service){
		ArrayList<CSharpResourceModel> resources = new ArrayList<CSharpResourceModel>(service.getHasCSharpRModel());
		
		Graph<CSharpResourceModel> resourcesGraph = new Graph<CSharpResourceModel>(resources.size());
		
		for(Iterator<CSharpResourceModel> i = resources.iterator(); i.hasNext() ; ){
			CSharpResourceModel resourceModel = i.next() ;
			resourcesGraph.addVertex(resourceModel);	
		}		
		
		//System.out.println("Graph initialized");
		
		ArrayList<Vertex<CSharpResourceModel>> vertexList = resourcesGraph.getVertexList() ;
		
		for(Iterator<Vertex<CSharpResourceModel>> i = vertexList.iterator(); i.hasNext() ; ){
			
			int start = resourcesGraph.getVertexIndex(i.next());
			//System.out.println("Start Index = " + start);
			ArrayList<CSharpResourceModel> children = getChildren(resourcesGraph.getVertexData(start));
			
			for(Iterator<CSharpResourceModel> j = children.iterator(); j.hasNext() ; ){
				
				int end = resourcesGraph.getVertexIndex(j.next());
				
				//System.out.println("End Index = " + end);
				
				resourcesGraph.addEdge(start, end);
				
			}
		}
		
		//resourcesGraph.printGraph();
		return resourcesGraph;
	}
	
	public ArrayList<ArrayList<CSharpResourceModel>> getModelDeletePaths(CSharpResourceModel model, RESTfulServicePSM service ) {
		
		System.out.println("Find paths for resource with name : " + model.getName());
		
		Graph<CSharpResourceModel> resourceGraph = createResourceGraph(service);
		
		ArrayList<ArrayList<CSharpResourceModel>> paths = new ArrayList<ArrayList<CSharpResourceModel>>();
		
		ArrayList<CSharpResourceModel> init = new ArrayList<CSharpResourceModel>();
		init.add(model);
		paths.add(init);
		
		
		paths = recGetPaths(paths, resourceGraph);
		
		for (int pathID = 0 ; pathID < paths.size() ; pathID++ ){
			System.out.println();
			for (int i = 0 ; i < paths.get(pathID).size() ; i++ ){
			System.out.print(paths.get(pathID).get(i).getName() + " -> ");
			}
		}
		System.out.println("\n---------------------------------------------------------");
        return paths;
    }
	
	public ArrayList<ArrayList<CSharpResourceModel>> recGetPaths(ArrayList<ArrayList<CSharpResourceModel>> paths , Graph<CSharpResourceModel> resourceGraph){
	
		ArrayList<ArrayList<CSharpResourceModel>> finalPaths = new ArrayList<ArrayList<CSharpResourceModel>>();

		for (int pathID = 0 ; pathID < paths.size() ; pathID++ ){
		
			ArrayList<CSharpResourceModel> path = paths.get(pathID);
			ArrayList<CSharpResourceModel> adj = resourceGraph.getAdjData(path.get(path.size()-1));
			
			if (!adj.isEmpty()){
				for (int adjId = 0 ; adjId < adj.size() ; adjId++ ){
					
					CSharpResourceModel next = adj.get(adjId);
					//System.out.println("Next Adj :" + next.getName() + "	Iteration : " + pathID);
					
					if (resourceGraph.getAdjData(next).isEmpty()){
						//If last part of a path
						if (resourceGraph.isTargetByMult(next)){
							//if it is referenced by many
							//System.out.println("Leaf :" + next.getName());
							
							ArrayList<CSharpResourceModel> newPath = new ArrayList<CSharpResourceModel>(path);
							newPath.add(next);						
							finalPaths.add(newPath);
						}		
					}else{						
						ArrayList<CSharpResourceModel> newPath = new ArrayList<CSharpResourceModel>(path);
						if (!path.subList(0, path.size()-1).contains(path.get(path.size()-1)))	newPath.add(next);						
						finalPaths.add(newPath);			
					}
				}
			}else{
				ArrayList<CSharpResourceModel> newPath = new ArrayList<CSharpResourceModel>(path);				
				finalPaths.add(newPath);
			}
		}
		
		//System.out.println("Paths.equal() = " + paths.equals(finalPaths) + "	Paths size = " + finalPaths.size() );
		
		if (paths.equals(finalPaths) || paths.isEmpty()){

			//System.out.println("Done");
			
			for (int pathID = 0 ; pathID < finalPaths.size() ; pathID++ ){
				ArrayList<CSharpResourceModel> path = finalPaths.get(pathID);
				path.remove(0);
			}
			return finalPaths;
		}
		
		//System.out.println("Next Round");
		return recGetPaths(finalPaths , resourceGraph);
	}
			
	public ArrayList<CSharpResourceModel> getChildren(CSharpResourceModel model){
		ArrayList<CSharpResourceModel> children = new ArrayList<CSharpResourceModel>();
		EList<CSharpResourceModelManager> relatedManagers = model.getHasRelatedCSharpRMManager();
		
		for(Iterator<CSharpResourceModelManager> i = relatedManagers.iterator(); i.hasNext();){
			children.add(i.next().getHasRelatedCSharpRModel());			
		}
		
		return children;
	}
	
	public String getDate()
	{
		String actual;
		DateFormat dateFormatter = DateFormat.getDateTimeInstance();
		dateFormatter.setTimeZone(TimeZone.getTimeZone("GMT+3"));
		actual=dateFormatter.format(new Date());
		return actual;
	}
	
	public String getDir()
	{
		String helper = ModelServices.class.getResource("ModelServices.class").toString();
		return helper.substring(6, helper.lastIndexOf("ModelServices.class")).concat("ScaseLogo.png");
	}
	
	public String getCurDir()
	{
		return System.getProperty("user.dir");
	}

	public String getRandomGUID(){
		return java.util.UUID.randomUUID().toString();
		//return "sertsertsrtrtsert";
	}
}