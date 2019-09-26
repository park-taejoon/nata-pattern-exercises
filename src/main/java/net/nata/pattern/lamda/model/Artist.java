package net.nata.pattern.lamda.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class Artist {
	@NonNull
	String name;
	String members;
	String origin;//출신지
	
}
