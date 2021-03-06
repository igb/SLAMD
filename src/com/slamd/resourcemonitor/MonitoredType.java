/*
 *                             Sun Public License
 *
 * The contents of this file are subject to the Sun Public License Version
 * 1.0 (the "License").  You may not use this file except in compliance with
 * the License.  A copy of the License is available at http://www.sun.com/
 *
 * The Original Code is the SLAMD Distributed Load Generation Engine.
 * The Initial Developer of the Original Code is Neil A. Wilson.
 * Portions created by Neil A. Wilson are Copyright (C) 2004-2010.
 * Some preexisting portions Copyright (C) 2002-2006 Sun Microsystems, Inc.
 * All Rights Reserved.
 *
 * Contributor(s):  Bertold Kolics
 */
package com.slamd.resourcemonitor;



/**
 * Type of a monitored attribute.
 */
enum MonitoredType {
  /** Integer. */
  INT,
  /** Incremental (integer). */
  INCREMENTAL,
  /** Long. */
  LONG,
  /** Double. */
  DOUBLE

}
