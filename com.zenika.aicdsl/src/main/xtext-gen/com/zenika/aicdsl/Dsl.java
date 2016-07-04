/**
 * generated by Xtext 2.10.0
 */
package com.zenika.aicdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dsl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.zenika.aicdsl.Dsl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see com.zenika.aicdsl.AicdslPackage#getDsl()
 * @model
 * @generated
 */
public interface Dsl extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link com.zenika.aicdsl.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see com.zenika.aicdsl.AicdslPackage#getDsl_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Type> getElements();

} // Dsl
