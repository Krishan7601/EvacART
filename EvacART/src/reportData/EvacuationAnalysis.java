package reportData;

import java.awt.Point;
import java.util.Collection;

import scenario.EvacuationModel;
import scenario.ScenarioBuilder;
import scenario.ScenarioManager;

public class EvacuationAnalysis implements DataObserver {
	public ScenarioBuilder currentScenario;
	public int totalTime;
	public int responseTime;
	public int totalEvacuated;
	public int survivabilityFactor;
	public Collection<Integer> evacuationRateExits;
	public Collection<Point> bottleNecks;
	
	public Collection<EvacuationModel> evacModels;
	
	@Override
	public void update(EvacuationModel evacuationModel) {

	}
	
	public void modelSavedScenarios() {
		Container container = new ScenarioContainer();
		Iterator iterator = container.getIterator();
	}
}
