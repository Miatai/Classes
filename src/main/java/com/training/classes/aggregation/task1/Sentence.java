package com.training.classes.aggregation.task1;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
	private List<Word> sentence = new ArrayList<>();

	public Sentence(List<Word> sentence) {
		super();
		this.sentence = sentence;
	}

	public Sentence(String[] str) {
		this.sentence = convertStringArrayToWordList(str);
	}

	public Sentence(String str) {
		this.sentence = convertStringArrayToWordList(str.split(" "));
	}

	public List<Word> getSentence() {
		return new ArrayList<>(sentence);
	}

	public void setSentence(List<Word> sentence) {
		this.sentence = sentence;
	}

	public List<Word> convertStringArrayToWordList(String[] str) {
		List<Word> result = new ArrayList<>();
		for (String string : str) {
			result.add(new Word(string));
		}
		return result;
	}

	@Override
	public String toString() {
		StringBuilder strB = new StringBuilder();
		for (Word word : sentence) {
			strB.append(" " + word);
		}
		return strB.toString() + ".";
	}

}
