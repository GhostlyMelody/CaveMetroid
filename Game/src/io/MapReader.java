package io;

import java.util.ArrayList;

import model.*;
import model.entities.*;

public class MapReader {
	public static ArrayList <Entity> readMap (String mapFileName) {
		ArrayList <Entity> map = new ArrayList <Entity> ();
		map.add(EntityReader.readEntity("BLAH"));
		return map;
	}
}
