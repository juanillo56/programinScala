val nonEmptyList = List(1, 2, 3, 4, 5)
val emptyList = Nil
val nonEmptyMap = Map("one" -> 1, "two" -> 2, "three" -> 3)

//Process pairs
				// se eliminan {} del cuerpo del metodo ya que se regresa un string
def windows[T](seq: Seq[T]): String = 

	seq  match {
		case Seq(head1, head2, _*) => s"($head1, $head2), " + windows(seq.tail)
		case Seq(head, _*) => s"($head, _), "+ windows(seq.tail)
		case Nil => "Nil"
	}


for (seq <- Seq(nonEmptyList, emptyList, nonEmptyMap.toSeq)) {
	println(windows(seq))
}

// segunda version el metodo donde se elimina la creacion explicita del Seq
// utiliando el contructor +:
println("\n\n segunda version del metodo, utlizando constructor +:")

def windows2[T](seq: Seq[T]): String = seq  match {
		case head1 +: head2 +: tail => s"($head1, $head2), " + windows2(seq.tail)
		case head +: tail => s"($head, _), "+ windows2(seq.tail)
		case Nil => "Nil"
	}


for (seq <- Seq(nonEmptyList, emptyList, nonEmptyMap.toSeq)) {
	println(windows2(seq))
}

