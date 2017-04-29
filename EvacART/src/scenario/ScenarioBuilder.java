package scenario;

import java.awt.Point;
import java.util.Collection;

import egressStrategy.EgressBehavior;
import modelRepository.AbstractModel;

public class ScenarioBuilder {
	private OperationMode operationMode;
	
	private EgressBehavior egressBehavior;
	
	private AbstractModel scenarioModel;
	private ScenarioManager scenarioManager = ScenarioManager.getInstance();

	private int numberOfPeople;
	private Collection<Point> locationOfPeople;

	private int numberOfResponseTeams;
	private Collection<ResponseTeam> responseTeams;
	private Collection<Point> locationOfResponseTeam;
	
	public ScenarioBuilder() {
		
	}
	
	public void handleSaveScenario() {
		scenarioManager.saveScenario(this);
	}
}
