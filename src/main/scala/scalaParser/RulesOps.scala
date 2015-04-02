package scalaParser

trait RulesOps {

  def ExtractOpt: Option[String] => String = o => o getOrElse ""

  def Concat: (String, String) => String = (s1, s2) => s1 + s2

}