package edu.gatech.ir.teststats.record;

import edu.gatech.cc.rtinsect.AbstractMonitorObject;
import edu.gatech.cc.rtinsect.MonitorObject;
import edu.gatech.cc.rtinsect.monitor.interfaces.BasicBlockMonitorInterface;

public class NNBasicBlockMonitor extends AbstractMonitorObject implements
		BasicBlockMonitorInterface {

	public NNBasicBlockMonitor(Class parent, int probeCount,
			Class<? extends MonitorObject> monitorInterface) {
		super(parent, probeCount, monitorInterface);
	}

	@Override
	public void reportBlock(int probeId) {
		StringBuilder bbTraceId = new StringBuilder();
		bbTraceId.append(monitoredClass.getCanonicalName());
		bbTraceId.append(",");
		bbTraceId.append(getMethodName(probeId));
		bbTraceId.append(getMethodSignature(probeId));
		bbTraceId.append(",");
		bbTraceId.append(getContext(probeId));
		TraceRecorder.recordTraceInfo(bbTraceId.toString());
	}

	@Override
	public void reportBlockVars(int probeId, String[] names, Object[] values,
			Class[] types) {
		// intentionally left empty
	}

	@Override
	public void processData() {
		// intentionally left empty
	}

}
