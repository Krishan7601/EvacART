package scenario;

import java.awt.Point;
import java.util.Collection;

public class EvacuationModel {
	public ScenarioBuilder currentScenario;
	public int totalTime;
	public int responseTime;
	public int totalEvacuated;
	public int survivabilityFactor;
	public Collection<Integer> evacuationRateExits;
	public Collection<Point> bottleNecks;
	

	public EvacuationModel(ScenarioBuilder scenario) {
		this.currentScenario = scenario;
		runSimulation(currentScenario);
	}
	
	public EvacuationModel getEvacuationModel() {
		return this;
	}

	public static void runSimulation(ScenarioBuilder scenario) {

	}
}
