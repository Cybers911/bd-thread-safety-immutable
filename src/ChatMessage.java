

public final class ChatMessage implements Runnable {
    public final ChatUser recipient;
    public final ChatMessageContent messageContent;

    /**
     *
     * @param recipient The ChatUser object for our recipient.
     * @param messageContent The message to send.
     */
    public ChatMessage(ChatUser recipient, ChatMessageContent messageContent) {
        this.recipient = recipient;
        this.messageContent = messageContent;
    }

    public ChatUser getRecipient() {
        return recipient;
    }

    public ChatMessageContent getMessageContent() {
        return messageContent;
    }

    /**
     * Run the thread to send the message to a recipient.
     */
    @Override
    public void run() {
        // here's where we send the message to our recipient.
        System.out.println("Message: '" + this.messageContent.getMessage() + "' has been sent to user " +
                this.getRecipient().getUsername() + " by " + this.messageContent.getSender().getUsername() + " on " +
                this.messageContent.getCreationDate().toString());
    }
}
