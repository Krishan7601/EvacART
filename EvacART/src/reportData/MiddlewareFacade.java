package reportData;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Observer;

import scenario.EvacuationModel;
import scenario.ScenarioBuilder;

public class MiddlewareFacade implements DataSubject {
	private Collection<EvacuationModel> evacuationResultsData;
	private EvacuationModel currentEvacuationModel;
	private List<DataObserver> dataObservers = new ArrayList<DataObserver>();

	public EvacuationAnalysis evacAnalysis;
	public Vizualization vizualization;

	public MiddlewareFacade() {
		evacAnalysis = new EvacuationAnalysis();
		vizualization = new Vizualization();

		attach(evacAnalysis);
		attach(vizualization);		
	}

	public void addEvacuationModel(ScenarioBuilder scenario) {

	}

	@Override
	public void attach(DataObserver observer) {

	}

	@Override
	public void detach(DataObserver observer) {

	}

	@Override
	public void notifyObservers() {
		// update(currentEvacuationModel)
	}

}
