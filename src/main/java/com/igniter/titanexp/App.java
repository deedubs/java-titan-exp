package com.igniter.titanexp;

import com.thinkaurelius.titan.core.*;
import com.tinkerpop.blueprints.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	TitanGraph g = TitanFactory.open("/tmp/titan");
    	Vertex juno = g.addVertex(null);
    	juno.setProperty("name", "juno");
    	Vertex jupiter = g.addVertex(null);
    	jupiter.setProperty("name", "jupiter");
    	Edge married = g.addEdge(null, juno, jupiter, "married");
    	
    	System.out.print(married);
    }
}
