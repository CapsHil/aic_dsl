/*
 * generated by Xtext 2.10.0
 */
package com.zenika.serializer;

import com.google.inject.Inject;
import com.zenika.aicdsl.AicdslPackage;
import com.zenika.aicdsl.Battery;
import com.zenika.aicdsl.Click;
import com.zenika.aicdsl.Dsl;
import com.zenika.aicdsl.Feature;
import com.zenika.aicdsl.Gps;
import com.zenika.aicdsl.Run;
import com.zenika.aicdsl.Scenario;
import com.zenika.aicdsl.Sensor;
import com.zenika.services.AicdslGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class AicdslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AicdslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AicdslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AicdslPackage.BATTERY:
				sequence_Battery(context, (Battery) semanticObject); 
				return; 
			case AicdslPackage.CLICK:
				sequence_Click(context, (Click) semanticObject); 
				return; 
			case AicdslPackage.DSL:
				sequence_Dsl(context, (Dsl) semanticObject); 
				return; 
			case AicdslPackage.FEATURE:
				sequence_Feature(context, (Feature) semanticObject); 
				return; 
			case AicdslPackage.GPS:
				sequence_Gps(context, (Gps) semanticObject); 
				return; 
			case AicdslPackage.RUN:
				sequence_Run(context, (Run) semanticObject); 
				return; 
			case AicdslPackage.SCENARIO:
				sequence_Scenario(context, (Scenario) semanticObject); 
				return; 
			case AicdslPackage.SENSOR:
				sequence_Sensor(context, (Sensor) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Action returns Battery
	 *     Battery returns Battery
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Battery(ISerializationContext context, Battery semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AicdslPackage.Literals.BATTERY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AicdslPackage.Literals.BATTERY__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBatteryAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Click
	 *     Click returns Click
	 *
	 * Constraint:
	 *     buttonName=ID
	 */
	protected void sequence_Click(ISerializationContext context, Click semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AicdslPackage.Literals.CLICK__BUTTON_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AicdslPackage.Literals.CLICK__BUTTON_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClickAccess().getButtonNameIDTerminalRuleCall_1_0(), semanticObject.getButtonName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Dsl returns Dsl
	 *
	 * Constraint:
	 *     elements+=Type+
	 */
	protected void sequence_Dsl(ISerializationContext context, Dsl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Feature
	 *     Feature returns Feature
	 *
	 * Constraint:
	 *     (title=STRING? scenarios+=Scenario+)
	 */
	protected void sequence_Feature(ISerializationContext context, Feature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Gps
	 *     Gps returns Gps
	 *
	 * Constraint:
	 *     (lat=FLOAT lon=FLOAT alti=FLOAT)
	 */
	protected void sequence_Gps(ISerializationContext context, Gps semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AicdslPackage.Literals.GPS__LAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AicdslPackage.Literals.GPS__LAT));
			if (transientValues.isValueTransient(semanticObject, AicdslPackage.Literals.GPS__LON) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AicdslPackage.Literals.GPS__LON));
			if (transientValues.isValueTransient(semanticObject, AicdslPackage.Literals.GPS__ALTI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AicdslPackage.Literals.GPS__ALTI));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGpsAccess().getLatFLOATParserRuleCall_1_0(), semanticObject.getLat());
		feeder.accept(grammarAccess.getGpsAccess().getLonFLOATParserRuleCall_3_0(), semanticObject.getLon());
		feeder.accept(grammarAccess.getGpsAccess().getAltiFLOATParserRuleCall_5_0(), semanticObject.getAlti());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Run
	 *     Run returns Run
	 *
	 * Constraint:
	 *     appName=ID
	 */
	protected void sequence_Run(ISerializationContext context, Run semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AicdslPackage.Literals.RUN__APP_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AicdslPackage.Literals.RUN__APP_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRunAccess().getAppNameIDTerminalRuleCall_1_0(), semanticObject.getAppName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Scenario returns Scenario
	 *
	 * Constraint:
	 *     (title=STRING? actions+=Action+)
	 */
	protected void sequence_Scenario(ISerializationContext context, Scenario semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Sensor
	 *     Sensor returns Sensor
	 *
	 * Constraint:
	 *     (sensorName=ID value=INT title=[Scenario|STRING]?)
	 */
	protected void sequence_Sensor(ISerializationContext context, Sensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
