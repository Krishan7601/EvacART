package reportData;

import java.util.Collection;

import scenario.ScenarioBuilder;
import scenario.ScenarioManager;

public class ScenarioContainer implements Container {
	private ScenarioManager scenarioManger = ScenarioManager.getInstance();
	private Collection<ScenarioBuilder> scenarios = ScenarioManager.scenarios;
	
	@Override
	public Iterator getIterator() {
		return new ScenarioIterator();
	}

}
