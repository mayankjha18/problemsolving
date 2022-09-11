package multithreading;

public class QueueTransportControl
{
    private QueueControl queueControl;
    //For simplicity  made chunk as Integer
    private Integer chunk;

    public QueueTransportControl(Integer chunk, QueueControl queueControl)
    {
        this.chunk = chunk;
        this.queueControl = queueControl;
    }

    public Integer getChunk()
    {
        return chunk;
    }

    public QueueControl getQueueControl()
    {
        return queueControl;
    }
}