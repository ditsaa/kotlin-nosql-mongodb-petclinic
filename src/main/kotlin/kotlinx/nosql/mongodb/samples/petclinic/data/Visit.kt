package kotlinx.nosql.mongodb.samples.petclinic.data

import kotlinx.nosql.mongodb.*
import kotlinx.nosql.*
import kotlinx.nosql.mongodb.DocumentSchema
import org.joda.time.LocalDate

object Visits : DocumentSchema<Visit>("visists", javaClass()) {
    val visitDate = date("date")
    val description = string("description")
    val petId = id("petId", Pets)
}

class Visit(val visitDate: LocalDate, val description: String, val petId: Id<String, Pets>) {
    val id : Id<String, Visits>? = null
}