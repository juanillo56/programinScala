val nonRmptyList = List(1,2,3,4,5)
val nonEmptyVector = Vector(1,2,3,4)
val nonEmptyMap = Map("one" ->1, "two" -> 2, "three" -> 3)

def reverseSeqToString[T](l: Seq[T]): String =
	l match {
		case pref :+ end => reverseSeqToString(pref) + s" :+ $end"
		case Nil => "Nil"
	}

for ( seq <- Seq(nonRmptyList,nonEmptyVector,nonEmptyMap.toSeq)) {
	println(reverseSeqToString(seq))
}
