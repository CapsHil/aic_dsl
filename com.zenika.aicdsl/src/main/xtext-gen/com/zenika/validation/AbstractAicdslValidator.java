/*
 * generated by Xtext 2.10.0
 */
package com.zenika.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractAicdslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(com.zenika.aicdsl.AicdslPackage.eINSTANCE);
		return result;
	}
	
}
