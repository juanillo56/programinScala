val bools = Seq(true, false)

for(bool <- bools) {
	bool match {
		case true => println("got heads")
		case false => println("got tails")
	}
}
