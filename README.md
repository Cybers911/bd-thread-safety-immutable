### Immutability and Thread Safety

Expected time required: 15 min

`ChatMessageDistributor` is a piece of functionality for a larger live chat application Amazon is 
looking to develop.
It distributes a `ChatMessage` to all the `ChatUser` members in a particular chat group. It uses a
separate thread to
send the message to each of the users in the group. Unfortunately, thread safety problems cropped up
due to the shared
information for the threads changing before the threads completed. Specifically, we're seeing that the
`ChatMessageContent` object is being  reused and changes to it are being propagated to threads that are
still sending
the original message. 

Using what you know of immutability, make changes to the given classes to ensure that the state of the 
message threads
cannot change while they are running. Leverage the provided workflows to check your results.

Verify that the tests in the `tst` folder pass. 

HINTS:
* [I'm not sure what needs to be immutable](hints/hint-01.md)
* [I don't remember exactly how to make a class immutable](hints/hint-02.md)
