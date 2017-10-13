// -*- C++ -*-
// AID-GENERATED
// =========================================================================
// This class was generated by AID - Abstract Interface Definition          
// DO NOT MODIFY, but use the org.freehep.aid.Aid utility to regenerate it. 
// =========================================================================
#ifndef HEPREP_HEPREPREADER_H
#define HEPREP_HEPREPREADER_H 1

// Copyright 2002-2004, Freehep.

#include <string>
#include <vector>

namespace HEPREP {

class HepRep;

/**
 * HepRepReader interface.
 *
 * @author Mark Donszelmann
 */
class HepRepReader {

public: 
    /// Destructor.
    virtual ~HepRepReader() { /* nop */; }

    /**
     * Returns a property (if set in the heprep.properties file).
     *
     * @param key property name
     * @param defaultValue value if property not found
     * @return property string
     */
    virtual std::string getProperty(std::string key, std::string defaultValue) = 0;

    /**
     * Closes the reader and its underlying stream.
     *
     * @return false in case of a stream problem.
     */
    virtual AID_EXCEPTION close() = 0;

    /**
     * Allows random access.
     *
     * @return true if this reader provides random access
     */
    virtual bool hasRandomAccess() = 0;

    /**
     * Reads a HepRep by name (random access only).
     *
     * @param name for the heprep to be read.
     * @return heprep.
     */
    virtual HepRep * read(std::string name) = 0;

    /**
     * Returns the current entry name (random acces only).
     *
     * @return name of the current entry or null if not supported.
     */
    virtual std::string entryName() = 0;

    /**
     * Returns a list of names of available entries (random rccess only). 
     * Zip files may contain instructions to skip a number of files. These files 
     * will not be included in the entries.
     *
     * @return list of entrynames or null if not supported.
     */
    virtual std::vector<std::string>  entryNames() = 0;

    /**
     * Allows for sequential access.
     *
     * @return true if sequential access is possible.
     */
    virtual bool hasSequentialAccess() = 0;

    /**
     * Resets a sequential HepRep reader.
     *
     * @return false in case of a stream problem.
     */
    virtual AID_EXCEPTION reset() = 0;

    /**
     * Returns the (estimated) number of HepReps in the reader.
     * Zip files may contain instructions to skip a number of files. These files 
     * will not be included in the estimate.
     *
     * @return number of HepReps, or -1 if cannot be calculated.
     */
    virtual int size() = 0;

    /**
     * Skips a number of HepReps in the reader.
     * Zip files may contain instructions to skip a number of files. These files 
     * will not be included in the count to be skipped.
     *
     * @param n number of HepReps to be skipped.
     * @return number of HepReps skipped.
     */
    virtual int skip(int n) = 0;

    /**
     * Is there a next heprep.
     *
     * @return true if the next heprep is available.
     */
    virtual bool hasNext() = 0;

    /**
     * Reads the next HepRep from the Reader.
     *
     * @return heprep.
     */
    virtual HepRep * next() = 0;
}; // class
} // namespace HEPREP
#endif /* ifndef HEPREP_HEPREPREADER_H */