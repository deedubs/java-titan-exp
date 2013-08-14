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
    	System.out.println(g.getIndexedKeys(Vertex.class));
    	Vertex pluto = g.getVertices("name","pluto").iterator().next();

    	System.out.print(pluto);
    }
}
