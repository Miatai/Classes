package com.training.classes.aggregation.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1. Создать объект класса Текст, используя классы Предложение, Слово. 
//Методы: дополнить текст, вывести наконсоль текст, заголовок текста.
public class Text {
	private Sentence header;
	private List<Sentence> sentences = new ArrayList<>();

	public Text(Sentence header, List<Sentence> text) {
		super();
		this.header = header;
		this.sentences = text;
	}

	public Text() {}

	public Text(String str) {
		splitStringToHeaderAndText(str);
	}

	public void setHeader(Sentence header) {
		this.header = header;
	}

	public Sentence getHeader() {
		return header;
	}

	public void setText(List<Sentence> text) {
		this.sentences = text;
	}

	public void addSentence(Sentence sentence) {
		this.sentences.add(sentence);
	}

	public void addSentence(String sentence) {
		this.sentences.add(new Sentence(sentence.trim()));
	}

	public void addSentence(List<Word> sentence) {
		this.sentences.add(new Sentence(sentence));
	}

	public List<Sentence> getText() {
		return new ArrayList<>(sentences);
	}

	public String getTextAsString() {
		StringBuilder strB = new StringBuilder();
		for (Sentence sentence : sentences) {
			strB.append(sentence.toString());
		}
		return strB.toString();
	}

	private void splitStringToHeaderAndText(String str) {
		String[] strAfterSplit = str.split("\n", 2);
		this.header = new Sentence(strAfterSplit[0]);
		splitTextToSentnces(strAfterSplit[1]);

	}

	private void splitTextToSentnces(String str) {
		String[] strArray = str.split("\\.");
		for (String strSentence : strArray) {
			addSentence(strSentence);
		}
	}

	@Override
	public String toString() {
		return header + "\n" + getTextAsString();
	}

}
