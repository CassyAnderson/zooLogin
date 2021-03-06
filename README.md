# zooLogin
//Pseudo Code: 


method main () {

INITIALIZE options //Prompt user to enter an option

To monitor an animal //User wants to monitor animal

To monitor a habitat //User wants to monitor habitat

Exit

IF zookeeper = monitorAnimal

Print "Which animal would you like to monitor?"

IF zookeeper = monitorHabitat

Print “Which habitat would you like to monitor?"

ELSE zookeeper = exit

ENDIF

WHILE zookeeper = monitorAnimal

ASK which animal

                               DETAILS on lions

                               DETAILS on tigers

                               DETAILS on bears

                               DETAILS on giraffes

// as soon as the zookeeper picks an animal the following appears

ENDWHILE

REPEAT // each animal chosen

                     PRINT “Animal: ”

               PRINT “Name: ”

               PRINT “Age: ”

                              PRINT ***** “Health concerns: ”

               PRINT “Feeding schedule: ”

UNTIL condition

WHILE zookeeper = monitorHabitat

ASK which habitat

                               DETAILS on penguin habitat
                               DETAILS on bird house
                               DETAILS on aquarium
// as soon as the zookeeper picks a habitat the following appears

ENDWHILE

REPEAT // each habitat chosen

                               PRINT “Habitat: ”
                               PRINT “Temperature: ”
                               PRINT *****”Food source: ”
                               PRINT “Cleanliness: ”
UNTIL condition

Prompt user: “Please describe details about the habitat:” //Prompt user to enter an option

foodSource // User indicates details about food source

healthConcerns // User indicates details about health concerns

habitatCare //User indicates status of the habitat

tempRange //User indicates temperature status of the habitat

IF foodSource != normalRange

***** Print “Food source needs attention” // with new line

IF healthConcerns != unsafeConditions

***** Print “Safety concern found, needs immediate attention” // with new line

IF habitatCare != acceptableRange

***** Print “Habitat needs cleaning” // with new line

IF tempRange != normalTemp

***** Print “Habitat temperature is stable” // with new line

ELSE

ENDIF

RETURN

}
