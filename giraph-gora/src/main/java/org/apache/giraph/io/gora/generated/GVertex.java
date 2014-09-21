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
public class GVertex extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GVertex\",\"namespace\":\"org.apache.giraph.io.gora.generated\",\"fields\":[{\"name\":\"vertexId\",\"type\":\"long\"},{\"name\":\"value\",\"type\":\"float\"},{\"name\":\"edges\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"GEdge\",\"fields\":[{\"name\":\"vertexId\",\"type\":\"long\"},{\"name\":\"edgeValue\",\"type\":\"float\"}]}}}]}");

  /** Enum containing all data bean's fields. */
  public static enum Field {
    VERTEX_ID(0, "vertexId"),
    VALUE(1, "value"),
    EDGES(2, "edges"),
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
  "value",
  "edges",
  };

  /**
   * Gets the total field count.
   * @return int field count
   */
  public int getFieldsCount() {
    return GVertex._ALL_FIELDS.length;
  }

  private long vertexId;
  private float value;
  private java.util.List<org.apache.giraph.io.gora.generated.GEdge> edges;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return vertexId;
    case 1: return value;
    case 2: return edges;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value) {
    switch (field$) {
    case 0: vertexId = (java.lang.Long)(value); break;
    case 1: value = (java.lang.Float)(value); break;
    case 2: edges = (java.util.List<org.apache.giraph.io.gora.generated.GEdge>)((value instanceof org.apache.gora.persistency.Dirtyable) ? value : new org.apache.gora.persistency.impl.DirtyListWrapper((java.util.List)value)); break;
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
   * Gets the value of the 'value' field.
   */
  public java.lang.Float getValue() {
    return value;
  }

  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(java.lang.Float value) {
    this.value = value;
    setDirty(1);
  }
  
  /**
   * Checks the dirty status of the 'value' field. A field is dirty if it represents a change that has not yet been written to the database.
   * @param value the value to set.
   */
  public boolean isValueDirty(java.lang.Float value) {
    return isDirty(1);
  }

  /**
   * Gets the value of the 'edges' field.
   */
  public java.util.List<org.apache.giraph.io.gora.generated.GEdge> getEdges() {
    return edges;
  }

  /**
   * Sets the value of the 'edges' field.
   * @param value the value to set.
   */
  public void setEdges(java.util.List<org.apache.giraph.io.gora.generated.GEdge> value) {
    this.edges = (value instanceof org.apache.gora.persistency.Dirtyable) ? value : new org.apache.gora.persistency.impl.DirtyListWrapper(value);
    setDirty(2);
  }
  
  /**
   * Checks the dirty status of the 'edges' field. A field is dirty if it represents a change that has not yet been written to the database.
   * @param value the value to set.
   */
  public boolean isEdgesDirty(java.util.List<org.apache.giraph.io.gora.generated.GEdge> value) {
    return isDirty(2);
  }

  /** Creates a new GVertex RecordBuilder */
  public static org.apache.giraph.io.gora.generated.GVertex.Builder newBuilder() {
    return new org.apache.giraph.io.gora.generated.GVertex.Builder();
  }
  
  /** Creates a new GVertex RecordBuilder by copying an existing Builder */
  public static org.apache.giraph.io.gora.generated.GVertex.Builder newBuilder(org.apache.giraph.io.gora.generated.GVertex.Builder other) {
    return new org.apache.giraph.io.gora.generated.GVertex.Builder(other);
  }
  
  /** Creates a new GVertex RecordBuilder by copying an existing GVertex instance */
  public static org.apache.giraph.io.gora.generated.GVertex.Builder newBuilder(org.apache.giraph.io.gora.generated.GVertex other) {
    return new org.apache.giraph.io.gora.generated.GVertex.Builder(other);
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
   * RecordBuilder for GVertex instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GVertex>
    implements org.apache.avro.data.RecordBuilder<GVertex> {

    private long vertexId;
    private float value;
    private java.util.List<org.apache.giraph.io.gora.generated.GEdge> edges;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.giraph.io.gora.generated.GVertex.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.giraph.io.gora.generated.GVertex.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing GVertex instance */
    private Builder(org.apache.giraph.io.gora.generated.GVertex other) {
            super(org.apache.giraph.io.gora.generated.GVertex.SCHEMA$);
      if (isValidValue(fields()[0], other.vertexId)) {
        this.vertexId = (java.lang.Long) data().deepCopy(fields()[0].schema(), other.vertexId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.value)) {
        this.value = (java.lang.Float) data().deepCopy(fields()[1].schema(), other.value);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.edges)) {
        this.edges = (java.util.List<org.apache.giraph.io.gora.generated.GEdge>) data().deepCopy(fields()[2].schema(), other.edges);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'vertexId' field */
    public java.lang.Long getVertexId() {
      return vertexId;
    }
    
    /** Sets the value of the 'vertexId' field */
    public org.apache.giraph.io.gora.generated.GVertex.Builder setVertexId(long value) {
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
    public org.apache.giraph.io.gora.generated.GVertex.Builder clearVertexId() {
      fieldSetFlags()[0] = false;
      return this;
    }
    
    /** Gets the value of the 'value' field */
    public java.lang.Float getValue() {
      return value;
    }
    
    /** Sets the value of the 'value' field */
    public org.apache.giraph.io.gora.generated.GVertex.Builder setValue(float value) {
      validate(fields()[1], value);
      this.value = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'value' field has been set */
    public boolean hasValue() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'value' field */
    public org.apache.giraph.io.gora.generated.GVertex.Builder clearValue() {
      fieldSetFlags()[1] = false;
      return this;
    }
    
    /** Gets the value of the 'edges' field */
    public java.util.List<org.apache.giraph.io.gora.generated.GEdge> getEdges() {
      return edges;
    }
    
    /** Sets the value of the 'edges' field */
    public org.apache.giraph.io.gora.generated.GVertex.Builder setEdges(java.util.List<org.apache.giraph.io.gora.generated.GEdge> value) {
      validate(fields()[2], value);
      this.edges = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'edges' field has been set */
    public boolean hasEdges() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'edges' field */
    public org.apache.giraph.io.gora.generated.GVertex.Builder clearEdges() {
      edges = null;
      fieldSetFlags()[2] = false;
      return this;
    }
    
    @Override
    public GVertex build() {
      try {
        GVertex record = new GVertex();
        record.vertexId = fieldSetFlags()[0] ? this.vertexId : (java.lang.Long) defaultValue(fields()[0]);
        record.value = fieldSetFlags()[1] ? this.value : (java.lang.Float) defaultValue(fields()[1]);
        record.edges = fieldSetFlags()[2] ? this.edges : (java.util.List<org.apache.giraph.io.gora.generated.GEdge>) new org.apache.gora.persistency.impl.DirtyListWrapper((java.util.List)defaultValue(fields()[2]));
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
  
  public GVertex.Tombstone getTombstone(){
  	return TOMBSTONE;
  }

  public GVertex newInstance(){
    return newBuilder().build();
  }

  private static final Tombstone TOMBSTONE = new Tombstone();
  
  public static final class Tombstone extends GVertex implements org.apache.gora.persistency.Tombstone {
  
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
	   * Gets the value of the 'value' field.
		   */
	  public java.lang.Float getValue() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'value' field.
		   * @param value the value to set.
	   */
	  public void setValue(java.lang.Float value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'value' field. A field is dirty if it represents a change that has not yet been written to the database.
		   * @param value the value to set.
	   */
	  public boolean isValueDirty(java.lang.Float value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
				  /**
	   * Gets the value of the 'edges' field.
		   */
	  public java.util.List<org.apache.giraph.io.gora.generated.GEdge> getEdges() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'edges' field.
		   * @param value the value to set.
	   */
	  public void setEdges(java.util.List<org.apache.giraph.io.gora.generated.GEdge> value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'edges' field. A field is dirty if it represents a change that has not yet been written to the database.
		   * @param value the value to set.
	   */
	  public boolean isEdgesDirty(java.util.List<org.apache.giraph.io.gora.generated.GEdge> value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
		  
  }
  
}

