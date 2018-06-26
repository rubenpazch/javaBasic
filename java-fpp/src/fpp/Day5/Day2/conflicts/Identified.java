package interfacedemo.conflicts;

public interface Identified { 
	//int getId();
	default int getId() { return (int) (Math.random()*1000); } 
	}