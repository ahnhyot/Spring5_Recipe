package com.apress.springrecipes.sequence.component;

import com.apress.springrecipes.sequence.cls.Sequence;

public interface SequenceDao {
	public Sequence getSequence(String sequenceId);
	public int getNextValue(String sequenceId);
}