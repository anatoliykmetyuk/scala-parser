package scalaParser

import org.scalatest._

class TypesSpec extends FlatSpec with Matchers with ParserTestsHelper {

  behavior of "Types"

  it should "Modifiers -> Strings" in check(_.Mod)("override", "override")

}