/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.enums;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public enum BooleanTrueFalseLc implements org.jooq.EnumType {
	true_("true"),

	false_("false"),

	;

	private final java.lang.String literal;

	private BooleanTrueFalseLc(java.lang.String literal) {
		this.literal = literal;
	}

	@Override
	public java.lang.String getName() {
		return "BOOLEAN_TRUE_FALSE_LC";
	}

	@Override
	public java.lang.String getLiteral() {
		return literal;
	}
}
