// AID-GENERATED
// =========================================================================
// This class was generated by AID - Abstract Interface Definition          
// DO NOT MODIFY, but use the org.freehep.aid.Aid utility to regenerate it. 
// =========================================================================

// Copyright 2000-2005, FreeHEP.
package hep.graphics.heprep;

import java.util.List;


import java.util.Set;
/**
 * HepRepInstanceTree interface.
 *
 * @author Mark Donszelmann
 */
public interface HepRepInstanceTree extends HepRepTreeID {

    /**
     * Overlays the instance tree on the current tree.
     *
     * The list of instances of the instanceTree has to be the same as the current tree.
     * @param instanceTree tree to overlay
     */
    public void overlay(HepRepInstanceTree instanceTree);

    /**
     * Adds an instance to this instancetree.
     *
     * @param instance to be added.
     */
    public void addInstance(HepRepInstance instance);

    /**
     * Removes an instance from this instancetree.
     *
     * @param instance to be removed.
     */
    public void removeInstance(HepRepInstance instance);

    /**
     * Returns a collection of instances.
     *
     * @return collection of HepRepInstances.
     */
    public List/*<HepRepInstance>*/ getInstances();

    /**
     * Adds a related instance tree to this instancetree.
     *
     * @param instanceTree related instancetree.
     */
    public void addInstanceTree(HepRepTreeID instanceTree);


    /**
     * Returns a collection of associated instance trees.
     *
     * @deprecated use getInstanveTreeList()
     * @return collection of HepRepTreeIDs.
     */
    Set/*<HepRepTreeID>*/ getInstanceTrees();
    /**
     * Returns a collection of associated instance trees.
     *
     * @return collection of HepRepTreeIDs.
     */
    public List/*<HepRepTreeID>*/ getInstanceTreeList();

    /**
     * Returns the associated typetree.
     *
     * @return TreeID of the associated typetree.
     */
    public HepRepTreeID getTypeTree();

    /**
     * Returns a deep copy of this instancetree.
     *
     * @param typeTree associated type tree.
     * @return copy of this instancetree.
     * @throws CloneNotSupportedException if copying is not possible.
     */
    public HepRepInstanceTree copy(HepRepTypeTree typeTree) throws CloneNotSupportedException;
    /**
     * Returns a deep copy of this instancetree.
     *
     * @param typeTree associated type tree.
     * @param filter to filter the instances.
     * @return copy of this instancetree.
     * @throws CloneNotSupportedException if copying is not possible.
     */
    public HepRepInstanceTree copy(HepRepTypeTree typeTree, HepRepSelectFilter filter) throws CloneNotSupportedException;
} // class or interface
