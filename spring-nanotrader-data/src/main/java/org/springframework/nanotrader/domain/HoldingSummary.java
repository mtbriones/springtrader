package org.springframework.nanotrader.domain;

import java.math.BigDecimal;
import java.util.List;

public class HoldingSummary {
	private BigDecimal holdingsTotalGains;
	private List<HoldingAggregate> holdingRollups;
	
	public BigDecimal getHoldingsTotalGains() {
		return holdingsTotalGains;
	}
	public void setHoldingsTotalGains(BigDecimal holdingsTotalGains) {
		this.holdingsTotalGains = holdingsTotalGains;
	}
	
	public List<HoldingAggregate> getHoldingRollups() {
		return holdingRollups;
	}
	public void setHoldingRollups(List<HoldingAggregate> holdingRollups) {
		this.holdingRollups = holdingRollups;
	}

	@Override
	public String toString() {
		return "HoldingSummary [holdingsTotalGains=" + holdingsTotalGains
				+ ", holdingRollup=" + holdingRollups + "]";
	}


	
}
