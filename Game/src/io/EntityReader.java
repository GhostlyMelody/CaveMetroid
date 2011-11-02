package io;

import model.*;
import model.entities.*;

public class EntityReader {
	public static Entity readEntity (String line) {
		return new TextBox (new Position (50, 50), "Hello World!");
	}
}
