package com.project.dao.model;

import java.util.ArrayList;
import java.util.List;

import com.project.model.Parts;

public interface PartsMethodInterface {

	public void addParts(Parts parts);

	public List<Parts> getAllParts();
	
	public Parts getParts(String sku);

	public void editParts(Parts parts);
	
	public void removeParts(String sku);

}
