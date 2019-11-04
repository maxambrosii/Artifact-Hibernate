package entity;

import javax.persistence.*;

import java.sql.Date;
import java.sql.Time;

@Table(name = "GraphTraining")
public class GraphTraining{
	
	@ManyToMany
	private Long CodClient;
	
	@ManyToMany
	private Long CodTraining;
	
	@Column(name = "DataBeginTrainig")
	private Date DataBeginTraining;
	
	@Column(name = "TimeBeginTraining")
	private Time TimeBeginTraining;
	
	@Column(name = "DurationTraining")
	private Long DurationTraining;
	
	public GraphTraining() {
		
	}

	public Long getCodClient() {
		return CodClient;
	}



	public void setCodClient(Long codClient) {
		CodClient = codClient;
	}



	public Long getCodTraining() {
		return CodTraining;
	}



	public void setCodTraining(Long codTraining) {
		CodTraining = codTraining;
	}



	public Date getDataBeginTraining() {
		return DataBeginTraining;
	}



	public void setDataBeginTraining(Date dataBeginTraining) {
		DataBeginTraining = dataBeginTraining;
	}



	public Time getTimeBeginTraining() {
		return TimeBeginTraining;
	}



	public void setTimeBeginTraining(Time timeBeginTraining) {
		TimeBeginTraining = timeBeginTraining;
	}



	public Long getDurationTraining() {
		return DurationTraining;
	}



	public void setDurationTraining(Long durationTraining) {
		DurationTraining = durationTraining;
	}



	@Override
	public String toString() {
		return "GraphTraining [CodClient=" + CodClient + ", CodTraining=" + CodTraining + ", DataBeginTraining="
				+ DataBeginTraining + ", TimeBeginTraining=" + TimeBeginTraining + ", DurationTraining="
				+ DurationTraining + "]";
	}
	
}

