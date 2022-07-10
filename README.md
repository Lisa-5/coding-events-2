# coding-events-2

#purpose 
The app tracks events at different locations and offers details about these events.

#state 
The user is able to add events to the application and attach tags to the events.

#enchancements
Need to add a Person class so the user can select and save their favorite events.

Proposed Architechture Fields:

Fields:
- id  int
- Name  String
- Email  String
- Password  String
- List of Events  List<Event> : Many to Many
- Favorite Category  EventCategory : Many to One

Methods
- Getters and Setters
- Get Favorite Events (returns list of all event with favorite event category)
