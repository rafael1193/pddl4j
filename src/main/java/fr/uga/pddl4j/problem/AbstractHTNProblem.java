/*
 * Copyright (c) 2021 by Damien Pellier <Damien.Pellier@imag.fr>.
 *
 * This file is part of PDDL4J library.
 *
 * PDDL4J is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation, either version 3 of the License.
 *
 * PDDL4J is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with PDDL4J.
 * If not, see <http://www.gnu.org/licenses/>
 */

package fr.uga.pddl4j.problem;

import fr.uga.pddl4j.parser.RequireKey;
import fr.uga.pddl4j.parser.ParsedProblemImpl;
import fr.uga.pddl4j.parser.Symbol;
import fr.uga.pddl4j.problem.operator.Method;
import fr.uga.pddl4j.problem.operator.TaskNetwork;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * This class contains all the methods shared by all HTN problem.
 *
 * @author D. Pellier
 * @version 4.0 - 08.02.2021
 */
public abstract class AbstractHTNProblem extends ADLProblem implements HTN {

    /**
     * Creates a new problem from a domain and problem.
     *
     *
     * @param problem the problem.
     */
    public AbstractHTNProblem(final ParsedProblemImpl problem) {
        super(problem);
    }

    /**
     * Returns the list of PDDL requirements accepted by the problem.
     *
     * @return the list of PDDL requirements accepted by the problem.
     */
    @Override
    public Set<RequireKey> getAcceptedRequirements() {
        Set<RequireKey> accepted = new HashSet<>();
        accepted.add(RequireKey.ADL);
        accepted.add(RequireKey.STRIPS);
        accepted.add(RequireKey.TYPING);
        accepted.add(RequireKey.EQUALITY);
        accepted.add(RequireKey.NEGATIVE_PRECONDITIONS);
        accepted.add(RequireKey.DISJUNCTIVE_PRECONDITIONS);
        accepted.add(RequireKey.EXISTENTIAL_PRECONDITIONS);
        accepted.add(RequireKey.UNIVERSAL_PRECONDITIONS);
        accepted.add(RequireKey.QUANTIFIED_PRECONDITIONS);
        accepted.add(RequireKey.CONDITIONAL_EFFECTS);
        accepted.add(RequireKey.HIERARCHY);
        accepted.add(RequireKey.METHOD_PRECONDITIONS);
        return accepted;
    }

    /**
     * Returns the list of task symbols of the problem.
     *
     * @return the list of task symbols of the problem.
     */
    public List<String> getTaskSymbols() {
        return super.getTaskSymbols();
    }

    /**
     * Returns the signatures of the task defined in the problem.
     *
     * @return the signatures of the task defined in the problem.
     */
    public List<List<Symbol<Integer>>> getTaskSignatures() {
        return super.getTaskSignatures();
    }

    /**
     * Returns the relevant operators for a task.
     *
     * @return the relevant operators for a task.
     */
    public List<List<Integer>> getTaskResolvers() {
        return super.getTaskResolvers();
    }

    /**
     * Returns the initial task network of the problem.
     *
     * @return the initial task network of the problem.
     */
    public TaskNetwork getInitialTaskNetwork() {
        return super.getInitialTaskNetwork();
    }

    /**
     * The list of relevant tasks of the problem.
     *
     * @return the list of relevant tasks of the problem.
     */
    public List<Task> getTasks() {
        return super.getTasks();
    }

    /**
     * Returns the list of instantiated methods of the problem.
     *
     * @return the list of instantiated methods of the problem.
     */
    public List<Method> getMethods() {
        return super.getMethods();
    }

}
