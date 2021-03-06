/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.example.reportincident.dao;

import java.util.List;

import org.apache.camel.example.reportincident.model.Incident;

public interface IncidentDAO
{

    /**
     * Gets the Incident.
     * 
     * @param id the id
     * @return the incident
     */
    public Incident getIncident( long id );

    /**
     * Find all incidents.
     * 
     * @return the list<Incident>
     */
    public List<Incident> findIncident();

    /**
     * Find Incident using incident id ref.
     * 
     * @param key the key
     * @return the list< order>
     */
    public List<Incident> findIncident( String key );

    /**
     * Save Incident.
     * 
     * @param incident the Incident
     */
    public void saveIncident( Incident incident );

    /**
     * Removes the Incident.
     * 
     * @param id the id
     */
    public void removeIncident( long id );

}
