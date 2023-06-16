package com.example.gawein.main.data.local.model



import java.io.File

data class Jobs(
    val id : Int,
    val company : String,
    val position: String,
    val photo : File? = null,
    val isAccepted : Boolean
)

object SampleJobsList {
    val sampleList = listOf(
        Jobs(
            1,
            "PT Sejahtera Plus",
            "Operation Manager",
            null,
            isAccepted  = true
        ),
        Jobs(
            2,
            "PT Mitra Jaya Abadi",
            "Operation Supervisor",
            null,
            isAccepted = true
        ),
        Jobs(
            3,
            "CV Sinar Cahaya",
            "Manager Warehouse",
            null,
            isAccepted = true
        ),
        Jobs(
            4,
            "PT Wijaya jaya",
            "Operation Manager",
            null,
            isAccepted =  false
        ),
        Jobs(
            5,
            "PT Mega Mendung",
            "CTO",
            null,
            isAccepted = true
        ),
        Jobs(
            6,
            "CV Mega Karya",
            "Technician",
            null,
            isAccepted = false
        ),

    )
}

