package com.vp.core.simpletest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LottosParent{
	private Optional<List<String>> lottoValues = Optional.of(new ArrayList<String>());

	public LottosParent() {
		lottoValues = Optional.ofNullable(null);
	}

	public void addLottoValue(String value) {
		lottoValues.ifPresent(lotto -> {lotto.add(value);});
	}

	protected String getLottoValue(int index){
		return lottoValues.get().get(index);
	}
	
	protected int getLottoSize(){
		return lottoValues.get().size();
	}
}
