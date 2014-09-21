/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.giraph.io.gora.generated;  
@SuppressWarnings("all")
public class GEdge extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GEdge\",\"namespace\":\"org.apache.giraph.io.gora.generated\",\"fields\":[{\"name\":\"vertexId\",\"type\":\"long\"},{\"name\":\"edgeValue\",\"type\":\"float\"}]}");

  /** Enum containing all data bean's fields. */
  public static enum Field {
    VERTEX_ID(0, "vertexId"),
    EDGE_VALUE(1, "edgeValue"),
    ;
    /**
     * Field's index.
     */
    private int index;

    /**
     * Field's name.
     */
    private String name;

    /**
     * Field's constructor
     * @param index field's index.
     * @param name field's name.
     */
    Field(int index, String name) {this.index=index;this.name=name;}

    /**
     * Gets field's index.
     * @return int field's index.
     */
    public int getIndex() {return index;}

    /**
     * Gets field's name.
     * @return String field's name.
     */
    public String getName() {return name;}

    /**
     * Gets field's attributes to string.
     * @return String field's attributes to string.
     */
    public String toString() {return name;}
  };

  public static final String[] _ALL_FIELDS = {
  "vertexId",
  "edgeValue",
  };

  /**
   * Gets the total field count.
   * @return int field count
   */
  public int getFieldsCount() {
    return GEdge._ALL_FIELDS.length;
  }

  private long vertexId;
  private float edgeValue;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return vertexId;
    case 1: return edgeValue;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value) {
    switch (field$) {
    case 0: vertexId = (java.lang.Long)(value); break;
    case 1: edgeValue = (java.lang.Float)(value); break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'vertexId' field.
   */
  public java.lang.Long getVertexId() {
    return vertexId;
  }

  /**
   * Sets the value of the 'vertexId' field.
   * @param value the value to set.
   */
  public void setVertexId(java.lang.Long value) {
    this.vertexId = value;
    setDirty(0);
  }
  
  /**
   * Checks the dirty status of the 'vertexId' field. A field is dirty if it represents a change that has not yet been written to the database.
   * @param value the value to set.
   */
  public boolean isVertexIdDirty(java.lang.Long value) {
    return isDirty(0);
  }

  /**
   * Gets the value of the 'edgeValue' field.
   */
  public java.lang.Float getEdgeValue() {
    return edgeValue;
  }

  /**
   * Sets the value of the 'edgeValue' field.
   * @param value the value to set.
   */
  public void setEdgeValue(java.lang.Float value) {
    this.edgeValue = value;
    setDirty(1);
  }
  
  /**
   * Checks the dirty status of the 'edgeValue' field. A field is dirty if it represents a change that has not yet been written to the database.
   * @param value the value to set.
   */
  public boolean isEdgeValueDirty(java.lang.Float value) {
    return isDirty(1);
  }

  /** Creates a new GEdge RecordBuilder */
  public static org.apache.giraph.io.gora.generated.GEdge.Builder newBuilder() {
    return new org.apache.giraph.io.gora.generated.GEdge.Builder();
  }
  
  /** Creates a new GEdge RecordBuilder by copying an existing Builder */
  public static org.apache.giraph.io.gora.generated.GEdge.Builder newBuilder(org.apache.giraph.io.gora.generated.GEdge.Builder other) {
    return new org.apache.giraph.io.gora.generated.GEdge.Builder(other);
  }
  
  /** Creates a new GEdge RecordBuilder by copying an existing GEdge instance */
  public static org.apache.giraph.io.gora.generated.GEdge.Builder newBuilder(org.apache.giraph.io.gora.generated.GEdge other) {
    return new org.apache.giraph.io.gora.generated.GEdge.Builder(other);
  }
  
  private static java.nio.ByteBuffer deepCopyToReadOnlyBuffer(
      java.nio.ByteBuffer input) {
    java.nio.ByteBuffer copy = java.nio.ByteBuffer.allocate(input.capacity());
    int position = input.position();
    input.reset();
    int mark = input.position();
    int limit = input.limit();
    input.rewind();
    input.limit(input.capacity());
    copy.put(input);
    input.rewind();
    copy.rewind();
    input.position(mark);
    input.mark();
    copy.position(mark);
    copy.mark();
    input.position(position);
    copy.position(position);
    input.limit(limit);
    copy.limit(limit);
    return copy.asReadOnlyBuffer();
  }
  
  /**
   * RecordBuilder for GEdge instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GEdge>
    implements org.apache.avro.data.RecordBuilder<GEdge> {

    private long vertexId;
    private float edgeValue;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.giraph.io.gora.generated.GEdge.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.giraph.io.gora.generated.GEdge.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing GEdge instance */
    private Builder(org.apache.giraph.io.gora.generated.GEdge other) {
            super(org.apache.giraph.io.gora.generated.GEdge.SCHEMA$);
      if (isValidValue(fields()[0], other.vertexId)) {
        this.vertexId = (java.lang.Long) data().deepCopy(fields()[0].schema(), other.vertexId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.edgeValue)) {
        this.edgeValue = (java.lang.Float) data().deepCopy(fields()[1].schema(), other.edgeValue);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'vertexId' field */
    public java.lang.Long getVertexId() {
      return vertexId;
    }
    
    /** Sets the value of the 'vertexId' field */
    public org.apache.giraph.io.gora.generated.GEdge.Builder setVertexId(long value) {
      validate(fields()[0], value);
      this.vertexId = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'vertexId' field has been set */
    public boolean hasVertexId() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'vertexId' field */
    public org.apache.giraph.io.gora.generated.GEdge.Builder clearVertexId() {
      fieldSetFlags()[0] = false;
      return this;
    }
    
    /** Gets the value of the 'edgeValue' field */
    public java.lang.Float getEdgeValue() {
      return edgeValue;
    }
    
    /** Sets the value of the 'edgeValue' field */
    public org.apache.giraph.io.gora.generated.GEdge.Builder setEdgeValue(float value) {
      validate(fields()[1], value);
      this.edgeValue = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'edgeValue' field has been set */
    public boolean hasEdgeValue() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'edgeValue' field */
    public org.apache.giraph.io.gora.generated.GEdge.Builder clearEdgeValue() {
      fieldSetFlags()[1] = false;
      return this;
    }
    
    @Override
    public GEdge build() {
      try {
        GEdge record = new GEdge();
        record.vertexId = fieldSetFlags()[0] ? this.vertexId : (java.lang.Long) defaultValue(fields()[0]);
        record.edgeValue = fieldSetFlags()[1] ? this.edgeValue : (java.lang.Float) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
  
  public GEdge.Tombstone getTombstone(){
  	return TOMBSTONE;
  }

  public GEdge newInstance(){
    return newBuilder().build();
  }

  private static final Tombstone TOMBSTONE = new Tombstone();
  
  public static final class Tombstone extends GEdge implements org.apache.gora.persistency.Tombstone {
  
      private Tombstone() { }
  
	  		  /**
	   * Gets the value of the 'vertexId' field.
		   */
	  public java.lang.Long getVertexId() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'vertexId' field.
		   * @param value the value to set.
	   */
	  public void setVertexId(java.lang.Long value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'vertexId' field. A field is dirty if it represents a change that has not yet been written to the database.
		   * @param value the value to set.
	   */
	  public boolean isVertexIdDirty(java.lang.Long value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
				  /**
	   * Gets the value of the 'edgeValue' field.
		   */
	  public java.lang.Float getEdgeValue() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'edgeValue' field.
		   * @param value the value to set.
	   */
	  public void setEdgeValue(java.lang.Float value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'edgeValue' field. A field is dirty if it represents a change that has not yet been written to the database.
		   * @param value the value to set.
	   */
	  public boolean isEdgeValueDirty(java.lang.Float value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
		  
  }
  
}

