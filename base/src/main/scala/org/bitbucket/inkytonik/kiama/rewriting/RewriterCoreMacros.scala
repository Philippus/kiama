/*
 * This file is part of Kiama.
 *
 * Copyright (C) 2013-2020 Anthony M Sloane, Macquarie University.
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package org.bitbucket.inkytonik.kiama
package rewriting

object RewriterCoreMacros {

    import org.bitbucket.inkytonik.dsinfo.DSInfo.makeCallWithName
    import org.bitbucket.inkytonik.kiama.util.Collections.Factory
    import org.bitbucket.inkytonik.kiama.util.Emitter
    import scala.reflect.macros._

    // Macros for the builder methods

    def allMacro(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def buildMacro(c : blackbox.Context)(t : c.Expr[Any]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def childMacro(c : blackbox.Context)(i : c.Expr[Int], s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def condMacro(c : blackbox.Context)(lr : c.Expr[PlusStrategy]) : c.Expr[Strategy] =
        makeCallWithName(c, "this.lessWithName")

    def congruenceMacro(c : blackbox.Context)(ss : c.Expr[Strategy]*) : c.Expr[Strategy] =
        makeCallWithName(c)

    def debugMacro(c : blackbox.Context)(msg : c.Expr[String], emitter : c.Expr[Emitter]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def detchoiceMacro(c : blackbox.Context)(q : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c, "this.lessPlusWithName")

    def logMacro(c : blackbox.Context)(s : c.Expr[Strategy], msg : c.Expr[String], emitter : c.Expr[Emitter]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def logfailMacro(c : blackbox.Context)(s : c.Expr[Strategy], msg : c.Expr[String], emitter : c.Expr[Emitter]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def mapMacro(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def memoMacro(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def nondetchoiceMacro(c : blackbox.Context)(q : c.Expr[Strategy]) : c.Expr[PlusStrategy] =
        makeCallWithName(c, "this.plusWithName")

    def oneMacro(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def optionMacro(c : blackbox.Context)(o : c.Expr[Option[Any]]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def queryMacro[T](c : blackbox.Context)(f : c.Expr[T ==> Unit]) : c.Expr[Strategy] =
        makeCallWithName(c, "this.queryWithName")

    def queryfMacro(c : blackbox.Context)(f : c.Expr[Any => Unit]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def ruleMacro[T](c : blackbox.Context)(f : c.Expr[T ==> T]) : c.Expr[Strategy] =
        makeCallWithName(c, "this.ruleWithName")

    def rulefMacro(c : blackbox.Context)(f : c.Expr[Any => Any]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def rulefsMacro[T](c : blackbox.Context)(f : c.Expr[T ==> Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c, "this.rulefsWithName")

    def seqMacro(c : blackbox.Context)(q : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c, "this.lessTimesWithName")

    def someMacro(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def strategyMacro[T](c : blackbox.Context)(f : c.Expr[T ==> Option[T]]) : c.Expr[Strategy] =
        makeCallWithName(c, "this.strategyWithName")

    def strategyfMacro(c : blackbox.Context)(f : c.Expr[Any => Option[Any]]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def termMacro[T](c : blackbox.Context)(t : c.Expr[T]) : c.Expr[Strategy] =
        makeCallWithName(c, "this.termWithName")

    // Macros for the library combinators

    def allbuMacro(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def alltdMacro(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def alldownup2Macro(c : blackbox.Context)(s1 : c.Expr[Strategy], s2 : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def alltdfoldMacro(c : blackbox.Context)(s1 : c.Expr[Strategy], s2 : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def andMacro(c : blackbox.Context)(s1 : c.Expr[Strategy], s2 : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def attemptMacro(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def bottomupMacro(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def bottomupSMacro(c : blackbox.Context)(s : c.Expr[Strategy], stop : c.Expr[(=> Strategy) => Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def breadthfirstMacro(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def doloopMacro(c : blackbox.Context)(s : c.Expr[Strategy], r : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def downupMacro1(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def downupMacro2(c : blackbox.Context)(s1 : c.Expr[Strategy], s2 : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def downupSMacro1(c : blackbox.Context)(s : c.Expr[Strategy], stop : c.Expr[(=> Strategy) => Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def downupSMacro2(c : blackbox.Context)(s1 : c.Expr[Strategy], s2 : c.Expr[Strategy], stop : c.Expr[(=> Strategy) => Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def everywhereMacro(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def everywherebuMacro(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def everywheretdMacro(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def innermostMacro(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def innermost2Macro(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def iorMacro(c : blackbox.Context)(s1 : c.Expr[Strategy], s2 : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def lastlyMacro(c : blackbox.Context)(s : c.Expr[Strategy], f : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def leavesMacro1(c : blackbox.Context)(s : c.Expr[Strategy], isleaf : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def leavesMacro2(c : blackbox.Context)(s : c.Expr[Strategy], isleaf : c.Expr[Strategy], skip : c.Expr[Strategy => Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def loopMacro(c : blackbox.Context)(r : c.Expr[Strategy], s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def loopiterMacro1(c : blackbox.Context)(i : c.Expr[Strategy], r : c.Expr[Strategy], s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def loopiterMacro2(c : blackbox.Context)(s : c.Expr[Int => Strategy], low : c.Expr[Int], high : c.Expr[Int]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def loopnotMacro(c : blackbox.Context)(r : c.Expr[Strategy], s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def manybuMacro(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def manytdMacro(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def notMacro(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def oncebuMacro(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def oncetdMacro(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def orMacro(c : blackbox.Context)(s1 : c.Expr[Strategy], s2 : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def outermostMacro(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def reduceMacro(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def repeatMacro1(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def repeatMacro2(c : blackbox.Context)(s : c.Expr[Strategy], r : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def repeatMacro3(c : blackbox.Context)(s : c.Expr[Strategy], n : c.Expr[Int]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def repeat1Macro1(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def repeat1Macro2(c : blackbox.Context)(s : c.Expr[Strategy], r : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def repeatuntilMacro(c : blackbox.Context)(s : c.Expr[Strategy], r : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def restoreMacro(c : blackbox.Context)(s : c.Expr[Strategy], rest : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def restoreAlwaysMacro(c : blackbox.Context)(s : c.Expr[Strategy], rest : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def somebuMacro(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def somedownupMacro(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def sometdMacro(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def testMacro(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def topdownMacro(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def topdownSMacro(c : blackbox.Context)(s : c.Expr[Strategy], stop : c.Expr[(=> Strategy) => Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    def whereMacro(c : blackbox.Context)(s : c.Expr[Strategy]) : c.Expr[Strategy] =
        makeCallWithName(c)

    // Queries

    def collectMacro[CC[X] <: Iterable[X], U](c : blackbox.Context)(f : c.Expr[Any ==> U])(cbf : c.Expr[Factory[U, CC[U]]]) : c.Expr[Any => CC[U]] =
        makeCallWithName(c, "this.collectWithName")

    def collectallMacro[CC[X] <: Iterable[X], U](c : blackbox.Context)(f : c.Expr[Any ==> CC[U]])(cbf : c.Expr[Factory[U, CC[U]]]) : c.Expr[Any => CC[U]] =
        makeCallWithName(c, "this.collectallWithName")

    def countMacro(c : blackbox.Context)(f : c.Expr[Any ==> Int]) : c.Expr[Any => Int] =
        makeCallWithName(c)

    def everythingMacro[T](c : blackbox.Context)(v : c.Expr[T])(f : c.Expr[(T, T) => T])(g : c.Expr[Any ==> T])(t : c.Expr[Any]) : c.Expr[T] =
        makeCallWithName(c)

}
