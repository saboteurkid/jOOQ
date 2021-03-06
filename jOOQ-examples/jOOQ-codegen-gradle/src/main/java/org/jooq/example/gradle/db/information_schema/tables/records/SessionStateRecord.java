/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.information_schema.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.5.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SessionStateRecord extends org.jooq.impl.TableRecordImpl<org.jooq.example.gradle.db.information_schema.tables.records.SessionStateRecord> implements org.jooq.Record2<java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -594093208;

	/**
	 * Setter for <code>INFORMATION_SCHEMA.SESSION_STATE.KEY</code>.
	 */
	public void setKey(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.SESSION_STATE.KEY</code>.
	 */
	public java.lang.String getKey() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>INFORMATION_SCHEMA.SESSION_STATE.SQL</code>.
	 */
	public void setSql(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>INFORMATION_SCHEMA.SESSION_STATE.SQL</code>.
	 */
	public java.lang.String getSql() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.example.gradle.db.information_schema.tables.SessionState.SESSION_STATE.KEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.example.gradle.db.information_schema.tables.SessionState.SESSION_STATE.SQL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getKey();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getSql();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SessionStateRecord value1(java.lang.String value) {
		setKey(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SessionStateRecord value2(java.lang.String value) {
		setSql(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SessionStateRecord values(java.lang.String value1, java.lang.String value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SessionStateRecord
	 */
	public SessionStateRecord() {
		super(org.jooq.example.gradle.db.information_schema.tables.SessionState.SESSION_STATE);
	}

	/**
	 * Create a detached, initialised SessionStateRecord
	 */
	public SessionStateRecord(java.lang.String key, java.lang.String sql) {
		super(org.jooq.example.gradle.db.information_schema.tables.SessionState.SESSION_STATE);

		setValue(0, key);
		setValue(1, sql);
	}
}
