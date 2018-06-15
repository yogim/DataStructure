package com.ymhase.common;

import com.ymhase.datastructure.arraynstring.StringRotation;

public class AlgorithmFactory {

    public static Algorithm getAlgorithm(String algorithmType) {
	RunAlgorithm algorithm = null;

	switch (algorithmType) {
	case "ISROTATION":
	    algorithm = (RunAlgorithm) new StringRotation();
	    break;

	default:
	    break;
	}

	return (Algorithm) algorithm;
    }

}
