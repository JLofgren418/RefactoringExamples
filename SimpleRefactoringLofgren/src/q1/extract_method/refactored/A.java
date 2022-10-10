package q1.extract_method.refactored;

import java.util.List;


public class A {
   Node m1(List<Node> nodes, String p) {
      // TODO: Your answer
	   extractedMethod(nodes, p);
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      // TODO: Your answer
	   extractedMethod(edgeList, p);
      // other implementation
      return null;
   }

   // TODO: Your answer
   // ? extractedMethod(?) {
   //
   // }
   
	private <T extends Graph> void extractedMethod(List<T> edgeList, String p) {
		for (T edge : edgeList) {
			if (edge.contains(p))
				System.out.println(edge);
		}
	}
   
}

class Node extends Graph{

}

class Edge extends Graph {
}

class Graph {

	String name;

	public Graph() {
		super();
	}

	public boolean contains(String p) {
	       return name.contains(p);
	   }

}