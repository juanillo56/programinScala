/*Pattern matching con sequencias*/

val nonEmptySeq 	= Seq(1, 2, 3, 4, 5)
val emptySeq 		= Seq.empty[Int]
val nonEmptyList 	= List(6, 7, 8, 9, 10)
val emptyList 		= Nil
val nonEmptyVector 	= Vector(11, 12, 13, 14, 15)
val emptyVector 	= Vector.empty[Int]
val nonEmptyMap 	= Map("one"-> 1, "two" -> 2, "three" -> 3)
val emptyMap 		= Map.empty[String,Int]

def seqToString[T](seq: Seq[T]): String = {
	seq match {
		/*Este match, entra en lo que sea que no sea Nil, y toma solo el primer elemnto y pasa el resto 
		  de forma recursiva a la misma funcion, hasta que encuentra un Nil*/
		case head +: tail => s"$head+: " + seqToString(tail)
		case Nil => "Nil"
	}
}

/*en esta parte se crea un seq con las colecciones que se crearon al inicio*/

for (seq <- Seq(nonEmptySeq, emptySeq, nonEmptyList, emptyList, nonEmptyVector, emptyVector, nonEmptyMap.toSeq, emptyMap.toSeq)){
	println(seqToString(seq))
}
