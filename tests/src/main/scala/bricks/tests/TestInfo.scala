package bricks
package tests

import bricks.macros.ClassInfo._

trait TestInfo {
  def testName = className(this).split('.').last

  def projectKey = "bricks"
}
