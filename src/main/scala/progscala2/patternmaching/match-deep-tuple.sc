val itemsCosts = Seq(("Pencil", 0.25), ("paper", 1.35), ("notebook", 2.43))
val itemsCostsIndices = itemsCosts.zipWithIndex

for (itemsCostsIndex <- itemsCostsIndices ) {
	itemsCostsIndex match {
		case ( (item, cost), index) => println(s"$index: $item costs $cost each")
	}
}
