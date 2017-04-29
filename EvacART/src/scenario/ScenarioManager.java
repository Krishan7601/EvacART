package scenario;

import java.util.Collection;

public class ScenarioManager {
	
	private static ScenarioManager uniqueInstance;
	public static Collection<ScenarioBuilder> scenarios;
	
	private ScenarioManager() {
		
	}
	
	public static ScenarioManager getInstance() {
		if (uniqueInstance == (null)) {
			uniqueInstance = new ScenarioManager();
		}
		return uniqueInstance;
	}
	
	public Collection<ScenarioBuilder> getScenarios() {
		return scenarios;
	}
	
	public void saveScenario(ScenarioBuilder scenario) {
		
	}
	
	public void removeScenario(ScenarioBuilder scenario) {
		
	}
}
