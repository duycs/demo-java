package com.duycs.template.service;

public abstract class BuildTemplate {

	//template method, final so subclasses can't override
	public final void build(){
		buildValidation();
		buildCatalog();
		buildAddon();
		System.out.println("built done.");
	}

	//methods to be implemented by subclasses
	public abstract void buildCatalog();
	public abstract void buildAddons();

	private void buildValidation() {
		System.out.println("Building validation");
	}
}