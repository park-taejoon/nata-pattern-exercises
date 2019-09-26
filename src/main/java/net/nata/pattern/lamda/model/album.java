package net.nata.pattern.lamda.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class album {
	@NonNull
	String name;
	String tracks;
	String musicians;
}
