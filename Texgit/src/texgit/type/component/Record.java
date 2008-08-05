package texgit.type.component;

import static br.com.nordestefomento.jrimum.ACurbitaObject.isNotNull;
import static org.apache.commons.lang.StringUtils.isNotBlank;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import texgit.type.IFixedField;

@SuppressWarnings("serial")
public class Record extends BlockOfFields{

	private String name;
	
	private String description;
	
	private FixedField<String> idType;
	
	private FixedField<Long> sequencialNumber;
	
	private boolean headOfGroup;
	
	private List<Record> innerRecords;
	
	private Set<String> declaredInnerRecords;
	
	private List<String> InnerOrder;
	
	public Record() {
		super();
	}
	
	@Override
	public Record clone() throws CloneNotSupportedException {
		//TODO Outros atributos
		return (Record) super.clone();
	}
	
	public FixedField<String> readID(String lineRecord) {

		FixedField<String> ffID = null;
		
		try {
			
			ffID = getIdType().clone();
			ffID.setName("");
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		getIdType().read(
				lineRecord.substring(getIdPosition(), getIdType()
						.getFixedLength()));
		
		return ffID;
	}
	
	public IFixedField<?> getField(String fieldName){
		
		IFixedField<?> field = null;
		
		for(FixedField<?> ff : this.getFields())
			if(ff.getName().equals(fieldName)){
				field = ff;
				break;
			}
		
		return field;
	}

	private int getIdPosition(){
		int pos = 0;
		
		for(FixedField<?> ff : this.getFields())
			if(!ff.getName().equals(idType.getName()))
				pos += ff.getFixedLength();
			else
				break;
		
		return pos;
	}


	public boolean isInnerRecord(String idRecord){
		
		boolean is = false;
		
		if(isNotBlank(idRecord)){
			if(isNotNull(declaredInnerRecords)){
				is = declaredInnerRecords.contains(idRecord.trim());
			}
		}
		
		return is;
	}
	
	public List<String> writeInnerRecords(){
		
		return writeInnerRecords(this);
	}
	
	private List<String> writeInnerRecords(Record record){

		ArrayList<String> out = new ArrayList<String>(record.getInnerRecords().size());
		
		for(String id : record.getInnerOrder()){
			
			if(record.isRepitable(id))
				List<Record> innRecs = record.getInnerRecords(id);
			else
				Record innRec = record.getInnerRecord(id);
			
			
			
			if(innRec.isHeadOfGroup())
				out.addAll(writeInnerRecords(record));
			else
				out.add(innRec.write());
				
		}
		
		return out;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public FixedField<String> getIdType() {
		return idType;
	}

	public void setIdType(FixedField<String> idType) {
		this.idType = idType;
	}

	public FixedField<Long> getSequencialNumber() {
		return sequencialNumber;
	}

	public void setSequencialNumber(FixedField<Long> sequencialNumber) {
		this.sequencialNumber = sequencialNumber;
	}

	public boolean isHeadOfGroup() {
		return headOfGroup;
	}

	public void setHeadOfGroup(boolean headOfGroup) {
		this.headOfGroup = headOfGroup;
	}

	public List<Record> getInnerRecords() {
		return innerRecords;
	}

	public void setInnerRecords(List<Record> innerRecords) {
		this.innerRecords = innerRecords;
	}

	public Set<String> getDeclaredInnerRecords() {
		return declaredInnerRecords;
	}

	public void setDeclaredInnerRecords(Set<String> declaredInnerRecords) {
		this.declaredInnerRecords = declaredInnerRecords;
	}

	public List<String> getInnerOrder() {
		return InnerOrder;
	}

	public void setInnerOrder(List<String> innerOrder) {
		InnerOrder = innerOrder;
	}

}